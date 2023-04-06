package recycler;

import static com.example.dz3java3.R.drawable.ic_launcher_background;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz3java3.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBind ( String contactName){
        imageView = itemView.findViewById(R.id.imageViewMain);
        textView = itemView.findViewById(R.id.textViewName);

        textView.setText(contactName);



    }

}
