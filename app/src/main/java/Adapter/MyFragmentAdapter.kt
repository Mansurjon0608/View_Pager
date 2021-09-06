package Adapter

import Fragment.FourFragment
import Fragment.OneFragment
import Fragment.ThreeFragment
import Fragment.TwoFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyFragmentAdapter(var list:ArrayList<Fragment>, fragmentManager: FragmentManager):
FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 4


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> OneFragment()
            1 -> TwoFragment()
            2 -> ThreeFragment()
            3 -> FourFragment ()
            else -> OneFragment()
        }
    }

}