package company.fourleafclover;

import io.sentry.Sentry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.*;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;


public class Main {
    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Sentry.init(options -> {
            options.setDsn("https://8515bca5b990450bbc0ce4ec5935d2c0@o561860.ingest.sentry.io/5699748");
            // Set traces_sample_rate to 1.0 to capture 100% of transactions for performance monitoring.
            // We recommend adjusting this value in production.
            options.setTracesSampleRate(1.0);
            // When first trying Sentry it's good to see what the SDK is doing:
            options.setDebug(false);
        });
        LOGGER.info("Initialized Sentry");

        try {

        } catch(Exception ex){
            Sentry.captureException(ex);
        }




    }

}
