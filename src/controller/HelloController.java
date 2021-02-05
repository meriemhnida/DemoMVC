package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Produit;
import model.ProduitDAOImp;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller

public class HelloController {
@RequestMapping("/hello")
public String Affichage() {
 return "HelloWorld";
}

/*@RequestMapping("/AddProduct.do")
public String AjouterProduit(@RequestParam(name = "nomProduit") String nomProduit,
		@RequestParam(name = "prixProduit") String prixProduit
		,@RequestParam(name = "idFournisseur") String idFournisseur, Model model) {
	
ProduitDAOImp dao= new ProduitDAOImp();
Produit produit= dao.create(new Produit(nomProduit,Double.parseDouble(prixProduit), Integer.parseInt(idFournisseur)));
model.addAttribute("msg", "Produit a été ajouté à la base de données");
 return "HelloWorld";
}*/
  
}
