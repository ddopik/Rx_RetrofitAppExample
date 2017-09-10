package view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.ddopik.basicapp.R;

import java.util.ArrayList;

import presenter.MainActivityPresenter;
import presenter.netWork.ApiUtils;
import presenter.netWork.retroFit_interface.SOService;
import presenter.netWork.retroFit_models.Item;
import presenter.netWork.retroFit_models.SOAnswersResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate (Bundle savedInstanceState)  {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main );


        MainActivityPresenter mainActivityPresenter=new MainActivityPresenter(this);
        mainActivityPresenter.intializeRecyclerAdapter();
        mainActivityPresenter.loadAnswers();

    }


}
