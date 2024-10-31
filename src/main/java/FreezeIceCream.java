class FreezeIceCream implements Runnable {
    @Override
    public void run() {
        System.out.println("Congelando el helado...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Helado congelado y listo para servir.");
    }
}
