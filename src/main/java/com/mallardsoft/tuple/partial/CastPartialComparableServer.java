package com.mallardsoft.tuple.partial;

// TODO Document.
class CastPartialComparableServer<PartialRest, Struct extends PartialRest, Rest>
implements ComparableServer<Struct, Rest>
{
    // TODO Document.
    private final ComparableServer<PartialRest, Rest> delegate;
    
    // TODO Document.
    public CastPartialComparableServer(ComparableServer<PartialRest, Rest> delegate)
    {
        this.delegate = delegate;
    }
    
    // TODO Document.
    public Comparable<Rest> comparable(Struct partial)
    {
        return delegate.comparable(partial);
    };
}