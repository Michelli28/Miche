package pe.edu.idat.daa2.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.idat.daa2.model.controllers.ClienteJpaController;
import pe.edu.idat.daa2.model.controllers.exceptions.NonexistentEntityException;
import pe.edu.idat.daa2.model.entities.Cliente;

@Controller
public class ClienteController {

    private EntityManager em;
    private EntityManagerFactory emf;
    private ClienteJpaController repo;

    public ClienteController() {
        em = getEntityManager();
        repo = new ClienteJpaController(emf);
    }

    private EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("LaNonnaPU");
        }
        return emf.createEntityManager();
    }

    @RequestMapping("clientes.htm")
    public ModelAndView Listar() {
        List<Cliente> clientes = new ArrayList<>();
        clientes = repo.findClienteEntities();

        ModelAndView mv = new ModelAndView();
        mv.addObject("clientes", clientes);
        mv.setViewName("clientes");
        return mv;
    }

    @RequestMapping(value = "nuevocliente.htm", method = RequestMethod.GET)
    public ModelAndView NuevoCliente() {
        ModelAndView mv = new ModelAndView();
        mv.addObject(new Cliente());
        mv.setViewName("nuevocliente");
        return mv;
    }

    @RequestMapping(value = "nuevocliente.htm", method = RequestMethod.POST)
    public ModelAndView NuevoCliente(@ModelAttribute("cliente") Cliente c) throws Exception {
        repo.create(c);
        return new ModelAndView("redirect:/clientes.htm");
    }

    @RequestMapping(value = "editarcliente.htm", method = RequestMethod.GET)
    public ModelAndView EditarCliente(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente obj = repo.findCliente(id);

        ModelAndView mv = new ModelAndView();
        mv.addObject("cliente", obj);
        mv.setViewName("editarcliente");
        return mv;
    }

    @RequestMapping(value = "editarcliente.htm", method = RequestMethod.POST)
    public ModelAndView EditarCliente(@ModelAttribute("cliente") Cliente c) throws Exception {
        repo.edit(c);

        return new ModelAndView("redirect:/clientes.htm");
    }

    @RequestMapping(value = "eliminarcliente.htm")
    public ModelAndView EliminarCliente(HttpServletRequest request) throws NonexistentEntityException {
        int id = Integer.parseInt(request.getParameter("id"));
        repo.destroy(id);

        return new ModelAndView("redirect:/clientes.htm");
    }
}
