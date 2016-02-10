package exp.Connect.retro.author_keywords;

import core.algo.Retro_retrieval;
import core.dataset.TextDataset;
import core.metrics.Result;
import exp.Connect.ConnectSetting;

/**
 * Created by niejia on 16/1/30.
 */
public class Connect_JSEP_Retro_Change1244 {
    public static void main(String[] args) {
        TextDataset textDataset = new TextDataset(ConnectSetting.Change1244_GroupedByJSEP,
                ConnectSetting.CleanedRequirement, ConnectSetting.OracleChange1244);

        String retro_out_path = "data/Connect/retro/author_keywords/ch1244.txt";
        Result result = Retro_retrieval.computeRetroResult(textDataset, retro_out_path, "Change1244", 53);
        result.showMatrix();
        result.showAveragePrecisionByRanklist();
    }
}
