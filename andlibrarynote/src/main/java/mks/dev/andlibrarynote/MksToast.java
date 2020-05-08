package mks.dev.andlibrarynote;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MksToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public static int Default = 1;
    public static int SUCCESS = 2;
    public static int WARNING = 3;
    public static int ERROR = 4;
    public static int INFO = 5;

    public MksToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, String message, int duration, int type, boolean Icon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.mks_toast, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        ImageView img1 = (ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);

        if (Icon == true)
            img1.setVisibility(View.VISIBLE);
        else if (Icon == false)
            img1.setVisibility(View.GONE);

        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.default_type);
                img.setImageResource(R.drawable.android_os_20px);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.success_type);
                img.setImageResource(R.drawable.ok_20px);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.warning_type);
                img.setImageResource(R.drawable.high_priority_20px);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.error_type);
                img.setImageResource(R.drawable.cancel_20px);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.info_type);
                img.setImageResource(R.drawable.info_20px);
                break;
            }
        toast.setView(layout);
        return toast;
    }

    public static Toast makeText(Context context, String message, int duration, int type, int ImageResource, boolean Icon) {
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.mks_toast, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        ImageView img1 = (ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);

        img.setImageResource(ImageResource);
        if (Icon == true)
            img1.setVisibility(View.VISIBLE);
        else if (Icon == false)
            img1.setVisibility(View.GONE);
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.default_type);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.success_type);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.warning_type);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.error_type);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.info_type);
                break;

            default:
                linearLayout.setBackgroundResource(R.drawable.default_type);
                img.setVisibility(View.GONE);
                break;
        }
        toast.setView(layout);
        return toast;
    }

}
