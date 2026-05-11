package co.hyperverge.hypersnapsdk.helpers.xmlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Tag {
    private ArrayList<Tag> mChildren = new ArrayList<>();
    private String mContent;
    private String mName;
    private String mPath;

    Tag(String str, String str2) {
        this.mPath = str;
        this.mName = str2;
    }

    void addChild(Tag tag) {
        this.mChildren.add(tag);
    }

    Tag getChild(int i10) {
        if (i10 < 0 || i10 >= this.mChildren.size()) {
            return null;
        }
        return this.mChildren.get(i10);
    }

    ArrayList<Tag> getChildren() {
        return this.mChildren;
    }

    int getChildrenCount() {
        return this.mChildren.size();
    }

    String getContent() {
        return this.mContent;
    }

    HashMap<String, ArrayList<Tag>> getGroupedElements() {
        HashMap<String, ArrayList<Tag>> hashMap = new HashMap<>();
        Iterator<Tag> it = this.mChildren.iterator();
        while (it.hasNext()) {
            Tag next = it.next();
            String name = next.getName();
            ArrayList<Tag> arrayList = hashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(name, arrayList);
            }
            arrayList.add(next);
        }
        return hashMap;
    }

    String getName() {
        return this.mName;
    }

    String getPath() {
        return this.mPath;
    }

    boolean hasChildren() {
        return this.mChildren.size() > 0;
    }

    void setContent(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt != ' ' && charAt != '\n') {
                    this.mContent = str;
                    return;
                }
            }
        }
    }

    public String toString() {
        return "Tag: " + this.mName + ", " + this.mChildren.size() + " children, Content: " + this.mContent;
    }
}
