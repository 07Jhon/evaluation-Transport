package evaluation.chauffeur;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class ChauffeurControlleur extends evaluation.utils.Controller{
    @GetMapping(path = "/chauffeur")
    public String liste(Model model, HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("nom", "Chauffeur");
        HttpSession session = httpServletRequest.getSession();
        JsonNode  creds = (JsonNode) session.getAttribute("creds");
        RestTemplate restTemplate = new RestTemplate();
        String url = environements.getUrl() +"/evaluation";
        try{
            httpServletRequest.setAttribute("chauffeur", restTemplate.getForObject(url,JsonNode.class));

        } catch (RestClientException e) {
            throw e;
        }


        return "liseChauffeur";
    }
}
