package andrianovaav.transaction.parser;

import andrianovaav.transaction.model.Result;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests for {@link CsvTransactionParser}
 */
public class CsvTransactionParserTest {

    private CsvTransactionParser transactionParser = new CsvTransactionParser();

    @Test
    public void should_parseParseTransactionsFile() throws Exception {
        File file = new File(getClass().getResource("transactionSet1.csv").toURI());
        Result<List<FinTransaction>> result = transactionParser.parseFile(file);
        assertThat(result.getStatus(), is(Result.Status.SUCCESS));
    }

}
