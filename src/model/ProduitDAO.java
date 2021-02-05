package model;

import java.util.List;

public interface ProduitDAO {
	public Produit create(Produit p);
	public Produit select(int id);
	public Produit update(Produit p);
	public void delete(int id);
}
