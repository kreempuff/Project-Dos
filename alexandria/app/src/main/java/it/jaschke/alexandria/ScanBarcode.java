package it.jaschke.alexandria;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Surface;
import android.view.SurfaceView;
import android.widget.Toast;

import it.jaschke.alexandria.CameraPreview.CameraPreview;

public class ScanBarcode extends ActionBarActivity {

    CameraPreview surfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.fragment_scan);

        surfaceView = (CameraPreview) findViewById(R.id.camera_preview);

        surfaceView.surfaceCreated(surfaceView.getHolder());

        setResult(1);
//        finish();
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {



        super.onResume();
    }
}
