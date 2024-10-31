class AddIngredients extends Thread {
    @Override
    public void run() {
        System.out.println("Agregando ingredientes al helado...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ingredientes agregados.");
    }
}
