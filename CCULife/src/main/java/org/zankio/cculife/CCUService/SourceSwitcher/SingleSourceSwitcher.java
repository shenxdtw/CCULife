package org.zankio.cculife.CCUService.SourceSwitcher;

import org.zankio.cculife.CCUService.Source.ISource;

public class SingleSourceSwitcher implements ISwitcher{

    private ISource source;

    public SingleSourceSwitcher(){}

    public SingleSourceSwitcher(ISource source) {
        this.source = source;
    }

    public void setSource(ISource source) {
        this.source = source;
    }

    @Override
    public ISource getSource() {
        return source;
    }
}
