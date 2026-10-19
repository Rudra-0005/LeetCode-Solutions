class Solution {
public:
    
    vector<int> targetIndices(auto& A, int k) {
    int lt = 0, eq = 0;
    for (auto& x : A) {
        lt += x <  k;
        eq += x == k;
    }
    A.resize(eq);
    iota(A.begin(), A.end(), lt);    
    return A;
}
};