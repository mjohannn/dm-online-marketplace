import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Controller
public class ProductController {

    @Inject
    private ProductDto p;

    @GET
    public void cgetproduct() {
        String nom=p.getName_product();
        int id=p.getId_product();
        int price=p.getPrice_product();
    }

    @GET
    public void getallproduct(){
        String nom=p.getName_product();
        int id=p.getId_product();
        int price=p.getPrice_product();
    }

    @POST
    public ProductDto addproduct(String nom,int id,int price){
        ProductDto product=new ProductDto();
        product.setId_product(id);
        product.setPrice_product(price);
        product.setName_product(nom);
        return product;
    }

    @POST
    public ProductDto updateproduct(ProductDto product, String nom,int id,int price){
        product.setId_product(id);
        product.setPrice_product(price);
        product.setName_product(nom);
        return product;
    }

}
