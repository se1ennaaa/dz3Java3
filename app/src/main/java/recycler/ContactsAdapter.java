package recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz3java3.R;

import java.util.ArrayList;
import java.util.function.LongToDoubleFunction;

public class ContactsAdapter extends RecyclerView.Adapter <ContactsViewHolder>{
     ArrayList<String> arrayList ;
    public ContactsAdapter(ArrayList<String>arrayList){
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
