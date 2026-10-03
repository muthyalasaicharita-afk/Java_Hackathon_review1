class Methods
{
    void calculateTotal(int morningUsage, int eveningUsage)
    {
        int total= morningUsage+eveningUsage;
        System.out.println("total"+total);
    }
    public static void main(String[] args)
    {
        Methods obj=new Methods();
        obj.calculateTotal(10,20);
    }
}
   