public abstract class _Start {

    public static _Start parse(Scan scn, Trace trace) {
        return Q2.parse(scn, trace);
    }

    public void $run() {
        System.out.println(this.toString());
    }

    public void $ok() {
        System.out.println("OK");
    }

}

