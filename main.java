public class main {
    public static void main(String[] args) throws Exception {
        boolean instant = false;
        boolean restart = false;
        int time = 5; // sec

        Runtime runtime = Runtime.getRuntime();

        String argsWin = "";

        if (restart) {
            argsWin += " -r";
        } else {
            argsWin += " -s";
        }
        if (!instant) {
            argsWin += " -t " + time;
        }

        try {
                runtime.exec("shutdown" + argsWin);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}