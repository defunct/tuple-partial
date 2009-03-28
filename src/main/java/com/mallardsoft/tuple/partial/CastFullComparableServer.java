package com.mallardsoft.tuple.partial;

// TODO Document.
class CastFullComparableServer<PartialRest, Rest, Struct extends Rest>
implements ComparableServer<PartialRest, Struct>
{
    // TODO Document.
    private final ComparableServer<PartialRest, Rest> delegate;
    
    // TODO Document.
    public CastFullComparableServer(ComparableServer<PartialRest, Rest> delegate)
    {
        this.delegate = delegate;
    }
    
    // TODO Document.
    public Comparable<Struct> comparable(PartialRest partial)
    {
        final Comparable<Rest> comparable = delegate.comparable(partial);
        return new Comparable<Struct>()
        {
            public int compareTo(Struct o)
            {
                return comparable.compareTo(o);
            }
        };
    };
}
