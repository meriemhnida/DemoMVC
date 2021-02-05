package model;

import java.util.List;

import model.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDAOImp dao= new ProduitDAOImp();
		Produit produit= dao.create(new Produit("Ordinateur",70000,1));
		System.out.println(produit);
		
		Produit p1= dao.select(1);
		Produit p2= dao.select(2);

		System.out.println(p1);
		System.out.println(p2);
		
	}

}
