package androidbase.ui.viewparts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.ws_proyect_android.R;
import com.example.ws_proyect_android.databinding.WidgetReutextcampoBinding;

public class LoginTestFragment extends Fragment {

    private WidgetReutextcampoBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LoginTestViewModel loginTestViewModel = new ViewModelProvider(this).get(LoginTestViewModel.class);

        binding = WidgetReutextcampoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewBasetest;
        loginTestViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        final TextView textView1 = binding.textViewBasetestdos;
        loginTestViewModel.getText2().observe(getViewLifecycleOwner(),textView1::setText);

        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LoginTestFragment.this)
                        .navigate(R.id.action_Login_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}
