class MixIngredients extends Thread {
    @Override
    public void run() {
        System.out.println("Mezclando ingredientes...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ingredientes mezclados.");
    }
}
