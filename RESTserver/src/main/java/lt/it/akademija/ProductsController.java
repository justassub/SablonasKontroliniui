package lt.it.akademija;

import org.springframework.web.bind.annotation.*;


//
@RestController
@RequestMapping(value = "/produktai")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductsController {


//
//    private final ProductServices productServices;
//
//
//    @Autowired
//    public ProductsController(ProductServices productServices) {
//        this.productServices = productServices;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    @ApiOperation(value = "Get Product", notes = "Returs Registered users")
//    public List<Product> getProducts() {
//        return productServices.getAll();
//    }
//
//
//
//    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
//    @ApiOperation(value = "Get Single Product", notes = "returns single Product by title")
//    public List<Product> singleProduct(@PathVariable Long id) {
//        return productServices.getOneList(id);
//    }
//










}
