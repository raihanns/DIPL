<?php
class M_Auth extends CI_model
{


    public function login($username)
    {
        $user = $this->db->get_where('user', ['username' => $username])->row_array();
        if ($user) {
            // usernya ada
            return true;
        } else {
            return false;
        }
    }
}
