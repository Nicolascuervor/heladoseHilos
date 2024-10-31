class Main {
    public static void main(String[] args) {

        AddIngredients addIngredients = new AddIngredients();
        MixIngredients mixIngredients = new MixIngredients();
        Thread freezeIceCream = new Thread(new FreezeIceCream());


        addIngredients.start();
        mixIngredients.start();
        freezeIceCream.start();

        try {
            addIngredients.join();
            mixIngredients.join();
            freezeIceCream.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Helado terminado y listo para servir.");
    }
}


