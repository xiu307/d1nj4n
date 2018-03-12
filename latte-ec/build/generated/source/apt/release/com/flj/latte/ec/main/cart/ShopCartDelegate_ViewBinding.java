// Generated code from Butter Knife. Do not modify!
package com.flj.latte.ec.main.cart;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ViewStubCompat;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.diabin.latte.ec.R;
import com.joanzapata.iconify.widget.IconTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShopCartDelegate_ViewBinding implements Unbinder {
  private ShopCartDelegate target;

  private View view2131558596;

  private View view2131558593;

  private View view2131558592;

  private View view2131558598;

  @UiThread
  public ShopCartDelegate_ViewBinding(final ShopCartDelegate target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_shop_cart, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.icon_shop_cart_select_all, "field 'mIconSelectAll' and method 'onClickSelectAll'");
    target.mIconSelectAll = Utils.castView(view, R.id.icon_shop_cart_select_all, "field 'mIconSelectAll'", IconTextView.class);
    view2131558596 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSelectAll();
      }
    });
    target.mStubNoItem = Utils.findRequiredViewAsType(source, R.id.stub_no_item, "field 'mStubNoItem'", ViewStubCompat.class);
    target.mTvTotalPrice = Utils.findRequiredViewAsType(source, R.id.tv_shop_cart_total_price, "field 'mTvTotalPrice'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, R.id.tv_top_shop_cart_remove_selected, "method 'onClickRemoveSelectedItem'");
    view2131558593 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickRemoveSelectedItem();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_top_shop_cart_clear, "method 'onClickClear'");
    view2131558592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickClear();
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_shop_cart_pay, "method 'onClickPay'");
    view2131558598 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickPay();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ShopCartDelegate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mIconSelectAll = null;
    target.mStubNoItem = null;
    target.mTvTotalPrice = null;

    view2131558596.setOnClickListener(null);
    view2131558596 = null;
    view2131558593.setOnClickListener(null);
    view2131558593 = null;
    view2131558592.setOnClickListener(null);
    view2131558592 = null;
    view2131558598.setOnClickListener(null);
    view2131558598 = null;
  }
}
