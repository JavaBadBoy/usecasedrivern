package com.mousa.usecasedriven.adapters;

import javax.swing.text.View;

public interface DomainModel<B extends ViewBuilder> {
    void view(B builder);
}
