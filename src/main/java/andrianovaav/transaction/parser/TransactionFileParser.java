package andrianovaav.transaction.parser;

import andrianovaav.transaction.model.Result;

import java.io.File;
import java.util.List;

/**
 *
 */
public abstract class TransactionFileParser {

    /**
     * Parses given file to a List of {@link FinTransaction}
     *
     * @param file file containing list of financial transactions
     * @return parsed list
     */
    public abstract Result<List<FinTransaction>> parseFile(File file);

}
