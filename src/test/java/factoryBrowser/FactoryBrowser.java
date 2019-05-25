package factoryBrowser;

/**
 * Eynar
 */
public class FactoryBrowser {

    /**
     *
     * @param value
     * @return
     */
    public static IBrowser make (String value){
        IBrowser driver;

        switch (value.toLowerCase()){
            case "chrome":
                driver = new Chrome();
                break;
            default:
                driver = new Chrome();
                break;
        }
        return driver;
    }
}
