package com.beratyesbek.transactionyoutube.proxy;

public class ProxyCategoryService implements CategoryService {

    private  CategoryServiceImpl categoryService;

    public ProxyCategoryService(){
        System.out.println("Proxy Category Service");
    }



    @Override
    public void create() {
        if (categoryService == null){
            categoryService = new CategoryServiceImpl();
        }

        try {
            System.out.println("Get Transaction");
            categoryService.create();
            throw  new RuntimeException();
        }catch (Exception e){
            System.out.println("Rollback Transaction");
        }

        System.out.println("Commit Transaction");
    }
}