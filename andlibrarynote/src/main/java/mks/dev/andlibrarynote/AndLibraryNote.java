package mks.dev.andlibrarynote;

import android.content.Context;
import android.widget.Toast;

public class AndLibraryNote {
    public static void Toaster(Context c,String message){
        Toast.makeText(c,message,Toast.LENGTH_LONG).show();
    }
}
