class X
{
    int a;
    double b;
}
class Y extends X
{
    int c;
}
class OutputX
{
    public static void main(String[] args)
    {
        X a = new X();
        Y b = new Y();
        Class obj;
        obj = a.getClass();
        System.out.print(obj.getName());
    }
}