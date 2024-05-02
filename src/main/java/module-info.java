module main.taleplease {
    requires javafx.controls;
    requires javafx.fxml;

    opens main.mainPackage to javafx.fxml;
    exports main.mainPackage;


    opens main.gameStatesPackage to javafx.fxml;
    exports main.gameStatesPackage;



}
