interface UserParam {
    userId?: string;
    userIdFuzzy?: string;

    nickName?: string;
    nickNameFuzzy?: string;

    realName?: string;
    realNameFuzzy?: string;

    userMail?: string;
    userMailFuzzy?: string;

    loginPassword?: string;
    loginPasswordFuzzy?: string;

    payPassword?: string;
    payPasswordFuzzy?: string;

    userMobile?: string;
    userMobileFuzzy?: string;

    modifyTime?: Date;
    modifyTimeStart?: string;
    modifyTimeEnd?: string;

    userRegtime?: Date;
    userRegtimeStart?: string;
    userRegtimeEnd?: string;

    userRegip?: string;
    userRegipFuzzy?: string;

    userLasttime?: Date;
    userLasttimeStart?: string;
    userLasttimeEnd?: string;

    userLastip?: string;
    userLastipFuzzy?: string;

    userMemo?: string;
    userMemoFuzzy?: string;

    sex?: string;
    sexFuzzy?: string;

    birthDate?: string;
    birthDateFuzzy?: string;

    pic?: string;
    picFuzzy?: string;

    status?: number;

    score?: number;
}
