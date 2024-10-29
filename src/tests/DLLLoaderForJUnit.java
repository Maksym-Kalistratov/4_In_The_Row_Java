package tests;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class DLLLoaderForJUnit implements BeforeAllCallback, ExtensionContext.Store.CloseableResource {
        private static boolean started = false;
    @Override
    public void beforeAll (ExtensionContext context){
     if (!started) {
        started = true;
        System.load ("/Users/macbookpro/Library/CloudStorage/OneDrive-Polsko-JapońskaAkademiaTechnikKomputerowych/C++/UTP_Project1_Lib/cmake-build-debug/libUTP_Project1_Lib.dylib");
     }
    }
    @Override
    public void close(){

    }
}