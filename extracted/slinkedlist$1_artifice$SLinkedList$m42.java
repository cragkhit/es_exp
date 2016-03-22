public SLinkedList m42(SLinkedList v10){
    if (v10 == null) {
        return v10;
    }
    SLinkedList v11;
    v11 = v10;
    SLinkedList v12;
    v12 = null;
    for (; v11 != null; ) {
        SLinkedList v13;
        v13 = v11.f12;
        v11.f12 = v12;
        v12 = v11;
        v11 = v13;
    }
    v10 = v12;
    return v10;
}