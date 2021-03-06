package com.asfoundation.wallet.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.asf.wallet.R;

public class EmptyTransactionsView extends FrameLayout {

  private final Button airdropButton;
  private final TextView noTransactionsTextView;

  public EmptyTransactionsView(@NonNull Context context, OnClickListener onClickListener,
      boolean isMainNetwork) {
    super(context);

    LayoutInflater.from(getContext())
        .inflate(R.layout.layout_empty_transactions, this, true);

    noTransactionsTextView = findViewById(R.id.no_transactions_text);
    airdropButton = findViewById(R.id.action_air_drop);
    findViewById(R.id.action_learn_more).setOnClickListener(onClickListener);

    if (isMainNetwork) {
      airdropButton.setVisibility(GONE);
      noTransactionsTextView.setText(R.string.no_transactions_yet_main);
    } else {
      airdropButton.setOnClickListener(onClickListener);
    }
  }

  public void setAirdropButtonEnable(boolean enabled) {
    airdropButton.setEnabled(enabled);
  }
}
