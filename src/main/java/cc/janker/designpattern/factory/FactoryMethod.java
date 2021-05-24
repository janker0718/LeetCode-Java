package cc.janker.designpattern.factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Application application = new ConcreateProductA1();
        Product object = application.getObject();
        object.method1();
    }
}

abstract  class Application {
//    private ProductA createProduct(){
//        return new ProductA();
//    }

//    public ProductA getObject(){
//        return  createProduct();
//    }


    abstract Product createProduct();

    public Product getObject(){
        Product product = createProduct();
        //...
        //...
        return  product;
    }

}

class ConcreateProductA extends Application{

    @Override
    Product createProduct() {
        //...
        return new ProductA();
    }
}

class ConcreateProductA1 extends Application{

    @Override
    Product createProduct() {
        //...
        return new ProductA1();
    }
}
class SimpleFactory{
    public static Product createProduct(String type){
        if (type.equals("0")){
            return new ProductA();
        }else if (type.equals("1")){
            return new ProductA1();
        }else
            return null;
    }
}
interface Product {
    void method1();
}


class ProductA implements Product{

    @Override
    public void method1(){
        System.out.println("ProductA.method1 executed. ");
    }

}

class ProductA1 implements Product{

    @Override
    public void method1(){
        System.out.println("ProductA1.method1 executed. ");
    }

}
