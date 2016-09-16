package name.javalex.kidcolors;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SoundPool.OnLoadCompleteListener, View.OnClickListener {

    final int MAX_STREAMS = 3;

    private static int currentBackgroundColor;
    private int soundIdBlack, soundIdBlue, soundIdBrown, soundIdFuchsia, soundIdGray, soundIdGreen,
            soundIdOrange, soundIdPink, soundIdPurple, soundIdRed, soundIdWhite, soundIdYellow;
    private TextView tvColorName;
    SoundPool sp;
    LinearLayout localLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(MAX_STREAMS, MAX_STREAMS, 0);
        sp.setOnLoadCompleteListener(this);
        tvColorName = ((TextView) findViewById(R.id.tvColorName));
        localLinearLayout = (LinearLayout) findViewById(R.id.MainLinearLayout);

        Button btnBlack = ((Button) findViewById(R.id.btnBlack));
        Button btnWhite = ((Button) findViewById(R.id.btnWhite));
        Button btnGray = ((Button) findViewById(R.id.btnGray));
        Button btnBrown = ((Button) findViewById(R.id.btnBrown));
        Button btnRed = ((Button) findViewById(R.id.btnRed));
        Button btnOrange = ((Button) findViewById(R.id.btnOrange));
        Button btnYellow = ((Button) findViewById(R.id.btnYellow));
        Button btnBlue = ((Button) findViewById(R.id.btnBlue));
        Button btnGreen = ((Button) findViewById(R.id.btnGreen));
        Button btnPurple = ((Button) findViewById(R.id.btnPurple));
        Button btnPink = ((Button) findViewById(R.id.btnPink));
        Button btnFuchsia = ((Button) findViewById(R.id.btnFuchsia));

        btnBlack.setOnClickListener(this);
        btnWhite.setOnClickListener(this);
        btnGray.setOnClickListener(this);
        btnBrown.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnPurple.setOnClickListener(this);
        btnPink.setOnClickListener(this);
        btnFuchsia.setOnClickListener(this);

        soundIdBlack = sp.load(this, R.raw.black, 1);
        soundIdWhite = sp.load(this, R.raw.white, 1);
        soundIdGray = sp.load(this, R.raw.gray, 1);
        soundIdBrown = sp.load(this, R.raw.brown, 1);
        soundIdRed = sp.load(this, R.raw.red, 1);
        soundIdOrange = sp.load(this, R.raw.orange, 1);
        soundIdYellow = sp.load(this, R.raw.yellow, 1);
        soundIdGreen = sp.load(this, R.raw.green, 1);
        soundIdBlue = sp.load(this, R.raw.blue, 1);
        soundIdPurple = sp.load(this, R.raw.purple, 1);
        soundIdPink = sp.load(this, R.raw.pink, 1);
        soundIdFuchsia = sp.load(this, R.raw.fuchsia, 1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBlack:
                tvColorName.setText(getResources().getText(R.string.black));
                localLinearLayout.setBackgroundResource(R.color.black);
                additionalColoringForAndroid5AndUp(R.color.black);
                sp.play(soundIdBlack, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnWhite:
                tvColorName.setText(getResources().getText(R.string.white));
                localLinearLayout.setBackgroundResource(R.color.white);
                additionalColoringForAndroid5AndUp(R.color.white);
                sp.play(soundIdWhite, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnGray:
                tvColorName.setText(getResources().getText(R.string.gray));
                localLinearLayout.setBackgroundResource(R.color.gray);
                additionalColoringForAndroid5AndUp(R.color.gray);
                sp.play(soundIdGray, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnBrown:
                tvColorName.setText(getResources().getText(R.string.brown));
                localLinearLayout.setBackgroundResource(R.color.brown);
                additionalColoringForAndroid5AndUp(R.color.brown);
                sp.play(soundIdBrown, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnRed:
                tvColorName.setText(getResources().getText(R.string.red));
                localLinearLayout.setBackgroundResource(R.color.red);
                additionalColoringForAndroid5AndUp(R.color.red);
                sp.play(soundIdRed, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnOrange:
                tvColorName.setText(getResources().getText(R.string.orange));
                localLinearLayout.setBackgroundResource(R.color.orange);
                additionalColoringForAndroid5AndUp(R.color.orange);
                sp.play(soundIdOrange, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnYellow:
                tvColorName.setText(getResources().getText(R.string.yellow));
                localLinearLayout.setBackgroundResource(R.color.yellow);
                additionalColoringForAndroid5AndUp(R.color.yellow);
                sp.play(soundIdYellow, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnGreen:
                tvColorName.setText(getResources().getText(R.string.green));
                localLinearLayout.setBackgroundResource(R.color.green);
                additionalColoringForAndroid5AndUp(R.color.green);
                sp.play(soundIdGreen, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnBlue:
                tvColorName.setText(getResources().getText(R.string.blue));
                localLinearLayout.setBackgroundResource(R.color.blue);
                additionalColoringForAndroid5AndUp(R.color.blue);
                sp.play(soundIdBlue, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnPurple:
                tvColorName.setText(getResources().getText(R.string.purple));
                localLinearLayout.setBackgroundResource(R.color.purple);
                additionalColoringForAndroid5AndUp(R.color.purple);
                sp.play(soundIdPurple, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnPink:
                tvColorName.setText(getResources().getText(R.string.pink));
                localLinearLayout.setBackgroundResource(R.color.pink);
                additionalColoringForAndroid5AndUp(R.color.pink);
                sp.play(soundIdPink, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            case R.id.btnFuchsia:
                tvColorName.setText(getResources().getText(R.string.fuchsia));
                localLinearLayout.setBackgroundResource(R.color.fuchsia);
                additionalColoringForAndroid5AndUp(R.color.fuchsia);
                sp.play(soundIdFuchsia, 1.0F, 1.0F, 0, 0, 1.0F);
                break;
            default:
                break;
        }
    }

    private void additionalColoringForAndroid5AndUp(int backColor) {
        currentBackgroundColor = backColor;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, backColor));
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, backColor));
        }
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        localLinearLayout.setBackgroundResource(savedInstanceState.getInt("backgroundColor"));
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("backgroundColor", currentBackgroundColor);

    }

    public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2) {
    }

}
