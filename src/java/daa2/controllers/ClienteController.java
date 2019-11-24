
package daa2.controllers;

import daa2.model.controllers.ClienteJpaController;
import daa2.model.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
            emf = Persistence.createEntityManagerFactory("AvenSACPU");
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
    public ModelAndView NuevoCliente(@ModelAttribute("cliente") Cliente c) throws Exception{
        repo.create(c);
        return new ModelAndView("redirect:/clientes.htm");
    }
}
