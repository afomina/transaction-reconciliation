package andrianovaav.transaction.reconciliation;

import andrianovaav.transaction.parser.FinTransaction;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class ReconciliationService {

    /**
     *
     * @param finTransactions1
     * @param finTransactions2
     */
    public void compare(List<FinTransaction> finTransactions1, List<FinTransaction> finTransactions2) {
        int firstSize = finTransactions1.size();
        int secondSize = finTransactions2.size();
        System.out.println("first set size: " + firstSize);
        System.out.println("second set size: " + secondSize);
        Set<FinTransaction> firstDataSet = new HashSet<>(finTransactions1);
        Set<FinTransaction> secondDataSet = new HashSet<>(finTransactions2);
        firstDataSet.removeAll(secondDataSet);
//        secondDataSet.removeAll(firstDataSet);

        Map<FinTransaction, FinTransaction> matchingTransactions = new HashMap<>();
        for (FinTransaction transaction1 : firstDataSet) {
            int maxCommonFields = 0;
            FinTransaction matchingTransaction = null;
            for (FinTransaction transaction2 : secondDataSet) {
                int commonFieldsCount = transaction1.countCommonFields(transaction2);
                if (commonFieldsCount > maxCommonFields) {
                    maxCommonFields = commonFieldsCount;
                    matchingTransaction = transaction2;
                }
            }

            if (maxCommonFields > 3) {
                matchingTransactions.put(transaction1, matchingTransaction);
            }
        }

        System.out.println("first set matched perfectly: count=" + (firstSize - firstDataSet.size()));
        System.out.println("first set matched perfectly: count=" + (secondSize - secondDataSet.size()));
        System.out.println("Possible matches:");
        for (Map.Entry<FinTransaction, FinTransaction> finTransactionFinTransactionEntry : matchingTransactions.entrySet()) {
            System.out.println(finTransactionFinTransactionEntry.getKey());
            System.out.println("matches");
            System.out.println(finTransactionFinTransactionEntry.getValue());
        }
    }
}
