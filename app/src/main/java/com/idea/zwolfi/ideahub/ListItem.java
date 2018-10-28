package com.idea.zwolfi.ideahub;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListItem extends Fragment{
    private ArrayList<Recipe> lvRow = new ArrayList<Recipe>();
    private View mainView;

    public ListItem() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.menuSettings:
                RecyclerView lvView = mainView.findViewById(R.id.lvList);
                LinearLayoutManager layoutManager = ((LinearLayoutManager )lvView.getLayoutManager());
                int firstVisiblePosition = layoutManager.findFirstCompletelyVisibleItemPosition();

                recycleAdapter lvAdapter;
                lvAdapter = new recycleAdapter(getActivity().getBaseContext(), lvRow);
                lvView.setAdapter(lvAdapter);

                Recipe newRow = new Recipe();
                newRow.setStatus(1);
                newRow.setTitle("Trumpppp");
                newRow.setDetail("Trump meme LOLLL");
                lvAdapter.add(newRow);

                layoutManager.scrollToPosition(firstVisiblePosition + 1);

                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mainView = inflater.inflate(R.layout.listout, container, false);
        RecyclerView lvView = mainView.findViewById(R.id.lvList);
        lvView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recycleAdapter lvAdapter;
        lvAdapter = new recycleAdapter(getActivity().getBaseContext(), lvRow);
        lvView.addItemDecoration(new simpleDivider(getActivity()));
        lvView.setAdapter(lvAdapter);

        Recipe newRow = new Recipe();
        newRow.setStatus(100);
        newRow.setTitle("Trumpppp");
        newRow.setDetail("Trump meme LOLLL");
        newRow.setMarkbar(100);
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("Lets meet up!");
        newRow.setDetail("I don't know you guys... but lets meet up!!");
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("Starbucks??");
        newRow.setDetail("Nearby starbucks? Send me location please!");
        newRow.setMarkbar(001);
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("WDF?");
        newRow.setDetail("Holy shit wdf is this");
        newRow.setMarkbar(111);
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("RIP");
        newRow.setDetail("Man you gotta be kidding me with this");
        newRow.setMarkbar(101);
        lvRow.add(newRow);
        //lvAdapter.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("Why you guys even here?");
        newRow.setDetail("stfu stop betcchingggg");
        newRow.setMarkbar(011);
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("FREE McDonal!!");
        newRow.setDetail("Come here everyone!");
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("Anyone know jork?");
        newRow.setDetail("Title^");
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("Traffic problem here");
        newRow.setDetail("fkn traffic being a bitch today even tho its saturday");
        lvRow.add(newRow);

        newRow = new Recipe();
        newRow.setStatus(0);
        newRow.setTitle("alsdkfjlaskdjf");
        newRow.setDetail("zxc7vasidfhlkqj2hrlkajsdhlfckjashdfkladsfzcxvwsdfasdfasf34523fa asdfasdf asdf asdf234523452345234523452345");
        lvRow.add(newRow);

        return mainView;
    }

}