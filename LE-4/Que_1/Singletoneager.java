class Singletoneager {
    private static Singletoneager obj = new Singletoneager();
    private Singletoneager() {
        System.out.println("eager object is isntantiated");
    }

    public static Singletoneager getInstance() { return obj; }
      public static void check()
    {
        System.out.println("check done eager");
    }
}