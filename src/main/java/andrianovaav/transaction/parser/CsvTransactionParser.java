package andrianovaav.transaction.parser;

import andrianovaav.transaction.model.Result;
import org.simpleflatmapper.csv.CsvParser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An implementation of {@link TransactionFileParser} that parses csv file
 */
public class CsvTransactionParser extends TransactionFileParser {

    @Override
    public Result<List<FinTransaction>> parseFile(File file) {
        try {
            List<FinTransaction> result = CsvParser
                    .mapTo(FinTransaction.class)
                    .stream(file).collect(Collectors.toList());
            return Result.success(result);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.error(e.getMessage());
        }
    }

}
