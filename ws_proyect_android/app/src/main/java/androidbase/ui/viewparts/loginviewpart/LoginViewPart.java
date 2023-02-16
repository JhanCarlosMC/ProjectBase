package androidbase.ui.viewparts.loginviewpart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.ws_proyect_android.R;
import com.example.ws_proyect_android.databinding.FragmentLoginBinding;

import androidbase.ui.viewmodels.loginviewmodel.LoginViewModel;

public class LoginViewPart extends Fragment {

    private FragmentLoginBinding binding;

    private LoginViewModel loginTestViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        loginTestViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView labelUser = binding.labelUser;
        loginTestViewModel.getLabelUser().observe(getViewLifecycleOwner(), labelUser::setText);

        final EditText textUser = binding.textUser;
        loginTestViewModel.getTextUser().observe(getViewLifecycleOwner(), textUser::setText);

        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginTestViewModel.setTextUser("Ingrese el correo");
//                NavHostFragment.findNavController(LoginViewPart.this)
//                        .navigate(R.id.action_Login_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}
