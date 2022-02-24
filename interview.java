namespace ComparisonsProblem
{
    // ## Problem
    // ValueItem is a class with two properties defined: 
    // an integer ID which uniquely indicates its identity, and a string Value that stores some data.
    //
    // A list of ValueItems has been mutated – instances have been added, removed, or changed. 
    // Given a copy of the list before and after the modification has taken place, 
    // identify which ValueItems have been added, removed, and changed.
    //
    // ## Sample Output
    // Item 1 changed from ‘foo’ to ‘fooEdited’
    // Item 2 was removed
    // Item 3 was added with value ‘baz’

    class Program
    {
        public class ValueItem
        {
            public int Id { get; }
            public string Value { get; }

            public ValueItem(int id, string value)
            {
                this.Id = id;
                this.Value = value;
            }
        }

        static void Main(string[] args)
        {
            List<ValueItem> before = new List<ValueItem>();
            before.Add(new ValueItem(1, "foo"));
            before.Add(new ValueItem(2, "bar"));

            List<ValueItem> after = new List<ValueItem>();
            after.Add(new ValueItem(1, "fooEdited"));
            after.Add(new ValueItem(3, "baz"));

            //your code here 
            for ( int i = 0, j = 0; i < before.length || j < before.length; i++, j++) {
                String b = null;
                if (i < before.length && before[i] == null) {
                    b = before[i].value
                }
                String a = null;
                if (j < after.length) {
                    a = after[i].value;
                }
                if (b == null && a.id != null) {
                    print(Added a.value);
                }
                if ( )
                
            }
        }
    }
}