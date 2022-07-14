public class example {
  public static void main(String[] args) throws Exception
    {
        int moneyWithdrawn = 2040;
        final int[] amountsFromLargestToSmallest = { 100, 50, 20, 10};
        final int smallestBillAmount = 10;

        int[] amountsOfEachBill = new int[amountsFromLargestToSmallest.length];

        if (moneyWithdrawn > 15000)
        {
            System.out.println("ATM Cash Limit exceeds.");
        }
        // Must be divisible by 10, since that's our smallest bill
        else if (moneyWithdrawn <= 0 || moneyWithdrawn % 10 != 0)
        {
            System.out.println("Please enter a valid number.");
        }
        else
        {
            for (int i = 0; i < amountsFromLargestToSmallest.length; i++)
            {
                int billAmount = amountsFromLargestToSmallest[i];

                int amount = (int) Math.floor(moneyWithdrawn / billAmount);

                if (amount > 0)
                {
                    moneyWithdrawn -= amount * billAmount;
                }

                amountsOfEachBill[i] = amount;
            }
        }
    }
}
