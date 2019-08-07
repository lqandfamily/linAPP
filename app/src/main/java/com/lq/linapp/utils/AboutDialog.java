package com.lq.linapp.utils;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.lq.linapp.R;

public class AboutDialog extends Dialog {
    public AboutDialog(Context context) {
        super(context);
        setContentView(R.layout.dialog_about);

        //设置背景透明，不然会出现白色直角问题
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setCanceledOnTouchOutside(false);

        Button aboutBtn = findViewById(R.id.about_btn);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        //设置参数必须在show之后，不然没有效果
        WindowManager.LayoutParams params = getWindow().getAttributes();
        getWindow().setAttributes(params);

    }
}
