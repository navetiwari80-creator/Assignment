class Salary {
    public static void main(String args[]) {
        float basic = 20000;
        float hra = basic * 0.2f;
        float da = basic * 0.1f;
        float ta = basic * 0.05f;
        float deduction = basic * 0.08f;

        float salary = basic + hra + da + ta - deduction;

        System.out.println("Total Salary = " + salary);
    }
}