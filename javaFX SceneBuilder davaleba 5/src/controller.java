import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.util.HashMap;
import java.util.Map;

public class controller {
    @FXML
    private ChoiceBox<String> from;
    @FXML
    private ChoiceBox<String> to;
    @FXML
    private Spinner<Double> amount;
    @FXML
    private Label result;
    private final Map<String, Double> currency = new HashMap<>();

    @FXML
    public void initialize{
        from.getItems().addAll("GEL", "USD", "EUR", "GBP");
        to.getItems().addAll("GEL", "USD", "EUR", "GBP");
        currency.put("GEl", 1.0);
        currency.put("USD",2.70);
        currency.put("EUR",3.17);
        currency.put("GBP",3.65);

    }

}
